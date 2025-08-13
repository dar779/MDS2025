import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vertical-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/button/src/vaadin-button.js';

@customElement('vista-vernotificaciones')
export class VistaVernotificaciones extends LitElement {
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
<vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout7" style="width: 100%; height: 100%;">
 <vaadin-horizontal-layout class="content" style="width: 100%; height: 100%;" id="vaadinHorizontalLayout">
  <vaadin-vertical-layout id="vaadinVerticalLayout6" style="width: 100%;">
   <vaadin-vertical-layout id="vaadinVerticalLayout5" style="align-self: center; height: 5%; align-items: center;">
    Menciones
   </vaadin-vertical-layout>
   <vaadin-vertical-layout id="menciones" style="width: 100%; height: 100%; padding-top: var(--lumo-space-xl);"></vaadin-vertical-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout id="vaadinVerticalLayout4" style="width: 100%;">
   <vaadin-vertical-layout id="vaadinVerticalLayout3" style="align-self: center; height: 5%; align-items: center;">
    ReTweets
   </vaadin-vertical-layout>
   <vaadin-vertical-layout id="retweets" style="width: 100%; height: 100%; padding-top: var(--lumo-space-xl);"></vaadin-vertical-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout id="vaadinVerticalLayout2" style="width: 100%;">
   <vaadin-vertical-layout id="vaadinVerticalLayout1" style="align-self: center; height: 5%; align-items: center;">
    Seguimiento
   </vaadin-vertical-layout>
   <vaadin-vertical-layout id="seguimiento" style="width: 100%; height: 100%; padding-top: var(--lumo-space-xl);"></vaadin-vertical-layout>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout id="vaadinVerticalLayout" style="align-self: center; padding-bottom: var(--lumo-space-m);">
  <vaadin-button id="volver" tabindex="0">
   Volver
  </vaadin-button>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
