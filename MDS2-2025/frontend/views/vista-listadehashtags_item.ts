import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/button/src/vaadin-button.js';
import '@vaadin/text-field/src/vaadin-text-field.js';
import '@vaadin/vertical-layout/src/vaadin-vertical-layout.js';

@customElement('vista-listadehashtags_item')
export class VistaListadehashtags_item extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout id="vaadinVerticalLayout" style="width: 100%; height: 100%;">
 <vaadin-horizontal-layout class="content" style="width: 100%; height: 10%;" id="vaadinHorizontalLayout">
  <vaadin-button id="hashtag" style="margin-left: var(--lumo-space-l); margin-top: var(--lumo-space-m);" tabindex="0">
    #hashtag 
  </vaadin-button>
  <vaadin-text-field id="usos" style="align-self: center; margin-bottom: var(--lumo-space-s); margin-left: var(--lumo-space-l);" type="text" readonly value="85"></vaadin-text-field>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
